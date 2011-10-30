package org.friark.mvcore.generators.grails;

import static org.junit.Assert.*;
import groovy.lang.Reference;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.junit.Test;

import MVCore.Attribute;
import MVCore.Constraint;
import MVCore.ConstraintType;
import MVCore.Documentation;
import MVCore.Domain;
import MVCore.impl.MVCoreFactoryImpl;
import MVCore.impl.MVCorePackageImpl;
import MVCore.util.MVCoreAdapterFactory;

public class GrailsGeneratorDomainTests {

	@Test
	public void testTrue() {
		assertTrue(true);
	}

	@Test
	public void testGenerateSimpleDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("name");
		attr.setType(getDataTypeFor("EString"));
		dom.getAttributes().add(attr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");
		// System.out.println(s);
		assertTrue(s.contains("package test"));
		assertTrue(s.contains("class Person"));
		assertTrue(s.contains("String name"));

	}

	@Test
	public void testGenerateSearchableDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		dom.setSearchable("true");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("name");
		attr.setType(getDataTypeFor("EString"));
		dom.getAttributes().add(attr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("static searchable = true"));

	}

	@Test
	public void testGenerateLogableDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		dom.setLoggable("true");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("name");
		attr.setType(getDataTypeFor("EString"));
		dom.getAttributes().add(attr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("static loggable = true"));

	}

	@Test
	public void testGenerateCustomConstraintDomainAttribute() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		dom.setLoggable("true");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("age");
		attr.setType(getDataTypeFor("int"));
		dom.getAttributes().add(attr);

		Constraint constr = MVCoreFactoryImpl.eINSTANCE.createConstraint();
		constr.setType(ConstraintType.CUSTOM_CONSTRAINT);
		constr.setValue("range:0..99");
		attr.getConstraints().add(constr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("age(range:0..99)"));

	}

	@Test
	public void testGenerateUniqueConstraintDomainAttribute() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		dom.setLoggable("true");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("age");
		attr.setType(getDataTypeFor("int"));
		attr.setUnique(true);
		dom.getAttributes().add(attr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("age(unique: true)"));

	}

	@Test
	public void testGenerateNotNullConstraintDomainAttribute() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("age");
		attr.setType(getDataTypeFor("int"));
		attr.setRequired(true);
		dom.getAttributes().add(attr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("age(nullable: false)"));

	}

	@Test
	public void testGenerateDomainCustomConstraintDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("age");
		attr.setType(getDataTypeFor("int"));
		dom.getAttributes().add(attr);

		Attribute attr2 = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr2.setName("shoesize");
		attr2.setType(getDataTypeFor("int"));
		dom.getAttributes().add(attr2);

		Constraint constr = MVCoreFactoryImpl.eINSTANCE.createConstraint();
		constr.setType(ConstraintType.CUSTOM_CONSTRAINT);
		constr.setValue("age(validator: {shoesize + age < 100})");

		dom.getConstraints().add(constr);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");

		assertTrue(s.contains("age(validator: {shoesize + age < 100})"));

	}

	@Test
	public void testGenerateSuperTypeDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");
		Attribute attr = MVCoreFactoryImpl.eINSTANCE.createAttribute();
		attr.setName("age");
		attr.setType(getDataTypeFor("int"));
		dom.getAttributes().add(attr);

		Domain parent = MVCoreFactoryImpl.eINSTANCE.createDomain();
		parent.setName("Entity");

		dom.setSuper(parent);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");
		System.out.println(s);
		assertTrue(s.contains("class Person extends Entity"));

	}

	@Test
	public void testGenerateReferenceDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");

		MVCore.Reference ref = MVCoreFactoryImpl.eINSTANCE.createReference();
		ref.setName("ref");
		ref.setSrc(dom);
		ref.setTarget(dom);
		ref.setUpperBound(1);
		dom.getReferences().add(ref);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");
		System.out.println(s);
		assertTrue(s.contains("Person ref"));

	}

	@Test
	public void testGenerateDocumentedDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");

		Documentation doc = MVCoreFactoryImpl.eINSTANCE.createDocumentation();
		doc.setValue("heipådeg");
		dom.getDocumentation().add(doc);
		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");
		System.out.println(s);
		assertTrue(s.contains("heipådeg"));

	}

	EDataType getDataTypeFor(String type) {
		EDataType dataType = EcoreFactoryImpl.eINSTANCE.createEDataType();
		dataType.setName(type);
		return dataType;
	}

	@Test
	public void testGenerateHasManyDomain() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("Person");

		MVCore.Reference ref = MVCoreFactoryImpl.eINSTANCE.createReference();
		ref.setName("ref");
		ref.setSrc(dom);
		ref.setTarget(dom);
		ref.setLowerBound(0);
		ref.setUpperBound(-1);
		dom.getReferences().add(ref);

		GrailsGenerator gen = new GrailsGenerator();

		String s = gen.buildEDomainClass(dom, "test");
		System.out.println(s);

		assertTrue(s.contains("static hasMany = [ref:Person]"));
	}

	@Test
	public void testFindMutiplicity() {
		MVCore.Reference ref = MVCoreFactoryImpl.eINSTANCE.createReference();
		ref.setName("ref");
		ref.setLowerBound(0);
		ref.setUpperBound(1);
		
		GrailsGenerator gen = new GrailsGenerator();

		assertEquals("0-1", gen.findMultiplicity(ref));
		
		ref.setUpperBound(-1);
		assertEquals("0-M", gen.findMultiplicity(ref));
		
		ref.setLowerBound(1);
		ref.setUpperBound(1);
		assertEquals("1", gen.findMultiplicity(ref));
		
		ref.setLowerBound(1);
		ref.setUpperBound(-1);
		assertEquals("1-M", gen.findMultiplicity(ref));
	}
}

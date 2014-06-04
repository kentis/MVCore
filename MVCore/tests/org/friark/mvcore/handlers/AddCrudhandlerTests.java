package org.friark.mvcore.handlers;

import static org.junit.Assert.*;

import java.util.List;

import org.friark.mvcore.handlers.AddCrudHandler;
import org.junit.Test;

import MVCore.Action;
import MVCore.Domain;
import MVCore.impl.MVCoreFactoryImpl;

public class AddCrudhandlerTests {

	@Test
	public void testGetGrailsCrudActions() {
		Domain dom = MVCoreFactoryImpl.eINSTANCE.createDomain();
		dom.setName("dill");
		List<Action> actions = new AddCrudHandler().getGrailsCrudActions(dom);
		assertEquals(8, actions.size());
	/*	
		EAction action = actions.get(0);
		assertEquals("index", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(1);
		assertEquals("list", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(2);
		assertEquals("show", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(3);
		assertEquals("delete", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(4);
		assertEquals("edit", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(5);
		assertEquals("update", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(6);
		assertEquals("create", action.getName());
		assertEquals("dill", action.getEType().getName());
		
		action = actions.get(7);
		assertEquals("save", action.getName());
		assertEquals("dill", action.getEType().getName());*/
	}

}

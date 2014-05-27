package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class BurbujaListener extends ClickListener 
{
	Burbuja burbuja;
	
	public BurbujaListener(Burbuja burbuja)
	{
		this.burbuja = burbuja;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y,
			int pointer, int button)
	{
		System.out.println("Estoy tocando una burbujita!");
		burbuja.remove();
		return true;
	}
}

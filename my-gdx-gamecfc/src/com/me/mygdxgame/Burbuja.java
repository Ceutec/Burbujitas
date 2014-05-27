package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Burbuja extends Image
{
	Burbuja()
	{
		super(new Texture(Gdx.files.internal("data/pelotita.png")));
		setY((float)Math.random()*300);
		
		addListener(new BurbujaListener(this));
	}
	
	@Override
	public void act(float time)
	{
		setX(getX()+2);
	}
}

package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MiListener extends ClickListener
{
	public boolean touchDown(InputEvent event, float x, float y,
			int pointer, int button)
	{
		System.out.println("Hola");
//		MyGdxGame.image.setX(MyGdxGame.image.getX()+5);
		return true;
	}
}

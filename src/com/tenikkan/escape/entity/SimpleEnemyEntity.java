package com.tenikkan.escape.entity;

import com.tenikkan.escape.input.SimpleMoveAI;
import com.tenikkan.escape.level.Level;
import com.tenikkan.math.Vector2f;

public class SimpleEnemyEntity extends Entity
{
    public SimpleEnemyEntity(int id, Vector2f position, Level level) 
    {
        super("simple_enemy", id, 0xff0000, 1.9f, 2.9f, 0.4f, position, new Vector2f(0, 0), null);
        setController(new SimpleMoveAI(this, level));
    }
}
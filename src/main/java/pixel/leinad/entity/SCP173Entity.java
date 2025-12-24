package pixel.leinad.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class SCP173Entity extends PathAwareEntity {
    protected <world> SCP173Entity(EntityType<? extends PathAwareEntity> type, World world){
        super(type,world);

    }
}


if(currentCooldown >= 0) {
    currentCooldown -= cooldownTick;
}

if (keyboard_check(vk_space) && currentCooldown <= 0) {
    
    if(image_angle == 0) {
        var bullet = instance_create(obj_Player.x, obj_Player.y - 20, obj_Bullet);
    }
    
    if(image_angle == 90) {
        var bullet = instance_create(obj_Player.x - 20, obj_Player.y, obj_Bullet);
    }
    
    if(image_angle == 180) {
        var bullet = instance_create(obj_Player.x, obj_Player.y + 20, obj_Bullet);
    }
    
    if(image_angle == 270) {
        var bullet = instance_create(obj_Player.x + 20, obj_Player.y , obj_Bullet);
    }

    
    with(bullet) {
        moveDirection = obj_Player.image_angle;
    }
    currentCooldown = cooldownPeriod;
}

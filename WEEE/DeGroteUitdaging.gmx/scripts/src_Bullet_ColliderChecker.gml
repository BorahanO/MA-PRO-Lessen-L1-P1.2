if place_meeting(self.x, self.y, obj_Wall_A) {
    instance_destroy();
}

if place_meeting(self.x, self.y, obj_Wall_B) {
    instance_destroy();
}

if place_meeting(self.x, self.y, obj_Enemy) {
    inst = instance_place(self.x, self.y, obj_Enemy);
    if inst != noone {
       with (inst) {
        currentHealth -= 1;
        if(currentHealth <= 0) {
            dc = irandom(100);
            if (dc <= enemyDropChance) {
                instance_create(x, y, obj_Pickup_Health);
            }
            global.points += global.ppk;
            instance_destroy();
        }
       }
    }
    instance_destroy();
}

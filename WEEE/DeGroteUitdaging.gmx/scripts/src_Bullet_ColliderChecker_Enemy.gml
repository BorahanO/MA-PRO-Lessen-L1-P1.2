if place_meeting(self.x, self.y, obj_Wall_A) {
    instance_destroy();
}

if place_meeting(self.x, self.y, obj_Wall_B) {
    instance_destroy();
}

if place_meeting(self.x, self.y, obj_Player) {
    inst = instance_place(self.x, self.y, obj_Player);
    if inst != noone {
       with (inst) {
        currentHealth -= 1;
        if(currentHealth <= 0) {
            room_goto(GameOver);
        }
       }
    }
    instance_destroy();
}

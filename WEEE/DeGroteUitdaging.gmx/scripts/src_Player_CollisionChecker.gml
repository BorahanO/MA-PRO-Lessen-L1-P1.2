if place_meeting(self.x, self.y, obj_Enemy) {
    room_goto(GameOver);
}

if place_meeting(self.x, self.y, obj_Pickup_Health) {
    currentHealth += 1;
    inst = instance_place(self.x, self.y, obj_Pickup_Health);
    if inst != noone {
       with (inst) {
        instance_destroy();
       }
    }
}

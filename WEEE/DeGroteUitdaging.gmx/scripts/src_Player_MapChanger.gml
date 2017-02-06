if(instance_number(obj_Enemy) == 0) {
    if(room == Level1) {
        room_goto(Level2);
    }
    
    if(room == Level2) {
        room_goto(Level3);
    }
    
    if(room == Level3) {
        room_goto(Level4);
    }
    
    if(room == Level4) {
        room_goto(Level5);
    }
    
    if(room == Level5) {
        room_goto(GameOver);
    }
}

if(keyboard_check_pressed(vk_enter)) {
    with (obj_Enemy)
   {
    instance_destroy();
   }
}

if keyboard_check(vk_space) {

    for(var i=0; i<5; i++) {
        effect_create_below(ef_explosion, irandom(room_width), irandom(room_height), 0, c_red);
    }
}

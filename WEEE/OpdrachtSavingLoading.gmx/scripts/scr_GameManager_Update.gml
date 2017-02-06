// OPDRACHT A:

/* 
    Zorg dat hier de scripts scr_GameManager_Save
    en scr_GameManager_Load worden uitgevoerd volgens
    de beschrijving van opdracht A.
*/

if(keyboard_check_pressed(vk_enter)) {
    scr_GameManager_Save();
}

if(keyboard_check_pressed(vk_backspace)) {
    scr_GameManager_Load();
}


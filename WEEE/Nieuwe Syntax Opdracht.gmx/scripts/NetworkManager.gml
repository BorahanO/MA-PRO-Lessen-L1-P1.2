if(keyboard_check(ord("h"))) {
    server = network_create_server( network_socket_tcp, 6510, 32 );
}

if(keyboard_check(ord("c"))) {
    client = network_create_socket( network_socket_tcp );
    network_connect( client, "127.0.0.1", 6510 );
}

if(!is_undefined(client)) {

    buff = buffer_create( 256, buffer_grow, 1);
    
    buffer_seek(buff, buffer_seek_start, 0);
    buffer_write(buff, buffer_s16, PING_CMD );
    network_send_packet( client, buff, buffer_tell(buff) );
}

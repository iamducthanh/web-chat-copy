package com.webchat.webchat.utils;

import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;
import com.webchat.webchat.component.Geocoder;
import com.webchat.webchat.entities.RoomDetail;
import com.webchat.webchat.service.impl.RoomDetailService;
import com.webchat.webchat.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtil {
    @Autowired
    static RoomDetailService roomDetailService;

    @Autowired
    static UserService userService;

    @Autowired
    private Drive googleDrive;




    public static void main(String[] args) throws InvalidKeyException, IOException, InterruptedException {
//        UUID uuid1 = UUID.randomUUID();
//        UUID uuid2 = UUID.randomUUID();
//        UUID uuid3 = UUID.randomUUID();
//        UUID uuid4 = UUID.randomUUID();
//        System.out.println(uuid1);
//        System.out.println(uuid2);
//        System.out.println(uuid3);
//        System.out.println(uuid4);
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String password = "123";
//        String encodedPassword = passwordEncoder.encode(password);
//        System.out.println(encodedPassword);
//        System.out.println(userService.findByUsername("admin").getFirstName());
//        List<RoomDetail> roomDetails = roomDetailService.findByUser(1);
//        System.out.println(roomDetails.size());

        System.out.println(Inet4Address.getLocalHost().getHostAddress());
    }
}

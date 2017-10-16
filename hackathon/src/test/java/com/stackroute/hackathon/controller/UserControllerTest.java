package com.stackroute.hackathon.controller;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.catalina.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.hackathon.Main;
import com.stackroute.hackathon.domain.User;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    String user1;
    @LocalServerPort
    private int port;
    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();
    User user;
    @Before
    public void setUp() throws Exception {
    	user = new User();
    	user.setId(01);
    	user.setAddress("koaramanagala");
    	user.setImageurl("im.jpg");
    	user.setName("Av1 rest");
    }
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testSaveUser() throws Exception {
        HttpEntity<Places> entity = new HttpEntity<Places>(places, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/create"),
                HttpMethod.POST, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Places saved Successfully",actual);
    }
    @Test
    public void testList() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/create"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);
    }
    @Test
    public void testGetUser() throws Exception {
    }
    @Test
    public void testUpdateUser() throws Exception {
    }
    @Test
    public void testDeleteUser() throws Exception {
    }
}
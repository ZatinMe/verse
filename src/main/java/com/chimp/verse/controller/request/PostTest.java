package com.chimp.verse.controller.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PostTest {
    String name;
    Long age;
}

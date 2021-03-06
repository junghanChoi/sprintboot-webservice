package com.jojoldu.book.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_feature_test(){
        String name = "test";
        int amount = 1000;

        //When
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //Then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

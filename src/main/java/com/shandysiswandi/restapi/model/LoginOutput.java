package com.shandysiswandi.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginOutput {

    private String token;

    private String type;

    private Long expiredAt; // millisecond

}
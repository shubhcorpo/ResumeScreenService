package com.hackathon.resumescreening.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResumeRequest {
    @NotNull(message = "ProfileName can not be null")
    private String profileName;
    @NotNull(message = "Percentile to match can not be null")
    private String percentileToMatch;
    @NotEmpty(message = "Skill set must be provided")
    private Set<String> skillSet;
}

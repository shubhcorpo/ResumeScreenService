package com.hackathon.resumescreening.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResume {
    private String candidateName;
    private String rawText;
    private String candidateScore;

}

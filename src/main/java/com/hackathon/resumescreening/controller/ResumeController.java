package com.hackathon.resumescreening.controller;

import com.hackathon.resumescreening.dto.CandidateResume;
import com.hackathon.resumescreening.dto.CandidateResumeRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_VALUE})
public class ResumeController {


    @GetMapping("/screen")
    public ResponseEntity<List<CandidateResume>> getScreeningData(@Valid @RequestBody CandidateResumeRequest candidateResumeRequest){

        System.out.println("Incoming requestBody is:"+candidateResumeRequest);
        CandidateResume candidateResume1= new CandidateResume("Harshal","Architect","95");
        CandidateResume candidateResume2= new CandidateResume("Dhaval","Tech Lead","97");
        CandidateResume candidateResume3= new CandidateResume("Aalekh","Data Scientiest","95");
        CandidateResume candidateResume4= new CandidateResume("LalaSaheb","Data Engineeer","92");
        CandidateResume candidateResume5= new CandidateResume("Shubham","Software Engineer","90");

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(List.of(candidateResume1, candidateResume2, candidateResume3,candidateResume4,candidateResume5));
    }
}

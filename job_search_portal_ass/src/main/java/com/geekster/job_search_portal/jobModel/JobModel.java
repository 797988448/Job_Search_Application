package com.geekster.job_search_portal.jobModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobModel {
    @Id
    private Long id;
    private String someField;
    @NotBlank(message = "Title is required")
    private String title;

    private String description;
    private String location;
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    //(hint @min for salary : should be above 20,000 )

    private String companyEmail;

    private String companyName;
    private String employerName;
    @NotNull(message = "Job type is required")
    private Types jobType;

    private LocalDate appliedDate;
}

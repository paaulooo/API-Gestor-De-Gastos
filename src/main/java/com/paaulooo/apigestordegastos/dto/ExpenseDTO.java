package com.paaulooo.apigestordegastos.dto;

import com.paaulooo.apigestordegastos.model.Category;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDTO {
    private String description;
    private Double amount;
    private LocalDate date;
    private Category category;
}

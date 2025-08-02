package com.paaulooo.apigestordegastos.dto;

import com.paaulooo.apigestordegastos.model.Category;
import lombok.Data;

@Data
public class ExpenseDTO {
    private String description;
    private Double amount;
    private String date;
    private Category category;
}

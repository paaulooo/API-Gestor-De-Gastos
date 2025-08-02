package com.paaulooo.apigestordegastos.service;

import com.paaulooo.apigestordegastos.dto.ExpenseDTO;
import com.paaulooo.apigestordegastos.model.Expense;
import com.paaulooo.apigestordegastos.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ExpenseService {
    private final ExpenseRepository repo;

    public Expense save(ExpenseDTO dto){
        Expense expense = new Expense();
        expense.setDescription(dto.getDescription());
        expense.setAmount(dto.getAmount());
        expense.setDate(dto.getDate());
        expense.setCategory(dto.getCategory());

        return repo.save(expense);
    }
    public List<Expense> show() {
        return repo.findAll();
    }

    public List<Expense> showByMonthYear(int month, int year) {
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.withDayOfMonth(start.lengthOfMonth());
        return repo.findByDateBetween(start, end);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Expense update(Long id, ExpenseDTO dto) {
        Expense gasto = repo.findById(id).orElseThrow(() -> new RuntimeException("Gasto não encontrado"));
        gasto.setDescription(dto.getDescription());
        gasto.setAmount(dto.getAmount());
        gasto.setDate(dto.getDate());
        gasto.setCategory(dto.getCategory());
        return repo.save(gasto);
    }
}

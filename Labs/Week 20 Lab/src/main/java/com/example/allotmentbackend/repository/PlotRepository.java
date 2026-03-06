package com.example.allotmentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.allotmentbackend.model.Plot;

public interface PlotRepository extends JpaRepository<Plot, Long> {
}

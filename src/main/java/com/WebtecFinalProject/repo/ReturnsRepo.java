package com.WebtecFinalProject.repo;

import com.WebtecFinalProject.Model.Returns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.UUID;

public interface ReturnsRepo extends JpaRepository<Returns, UUID> {
}
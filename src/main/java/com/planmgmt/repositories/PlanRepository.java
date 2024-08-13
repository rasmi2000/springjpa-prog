package com.planmgmt.repositories;

import com.planmgmt.entities.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
}

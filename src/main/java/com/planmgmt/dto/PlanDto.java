package com.planmgmt.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder(builderMethodName = "of")
public class PlanDto {
    private int planNo;
    private String planName;
    private String description;
    private String planType;
    private String eligibilityCriteria;

    public int getPlanNo() {
        return planNo;
    }

    public String getPlanName() {
        return planName;
    }

    public String getDescription() {
        return description;
    }

    public String getPlanType() {
        return planType;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanDto planDto = (PlanDto) o;
        return planNo == planDto.planNo && Objects.equals(planName, planDto.planName) && Objects.equals(description, planDto.description) && Objects.equals(planType, planDto.planType) && Objects.equals(eligibilityCriteria, planDto.eligibilityCriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planNo, planName, description, planType, eligibilityCriteria);
    }

    @Override
    public String toString() {
        return "PlanDto{" +
                "planNo=" + planNo +
                ", planName='" + planName + '\'' +
                ", description='" + description + '\'' +
                ", planType='" + planType + '\'' +
                ", eligibilityCriteria='" + eligibilityCriteria + '\'' +
                '}';
    }
}

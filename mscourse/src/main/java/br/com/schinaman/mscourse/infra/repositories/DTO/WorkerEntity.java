package br.com.schinaman.mscourse.infra.repositories.DTO;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_worker")
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerEntity that = (WorkerEntity) o;
        return id.equals(that.id) && Objects.equals(name, that.name) && Objects.equals(dailyIncome, that.dailyIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dailyIncome);
    }

    @Override
    public String toString() {
        return "WorkerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dailyIncome=" + dailyIncome +
                '}';
    }


}

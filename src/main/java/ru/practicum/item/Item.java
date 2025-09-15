package ru.practicum.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="items", schema = "public")
        class Item {
    @Id
    private Long id;

    private Long userId;

    private String url;
}
package com.example.projeto.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRecordDto {
    @NotNull
    private String productName;
    @NotNull
    private float productPrice;
    @NotNull
    private int productQuantity;
    @NotNull
    private UUID categoryId;
}

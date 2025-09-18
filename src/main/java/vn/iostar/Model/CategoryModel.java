package vn.iostar.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {

    private Long categoryId;

    @NotBlank(message = "Tên category không được để trống")
    private String name;

    private Boolean isEdit = false;
}

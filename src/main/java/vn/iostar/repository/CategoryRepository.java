package vn.iostar.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.iostar.entity.CategoryEntity;

import java.util.List;

public interface CategoryRepository  extends JpaRepository<CategoryEntity, Long> {
   // tim kiem noi dung theo ten
    List<CategoryEntity> findByNameContaining(String name);
    // tim kiem va phan trang
    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}

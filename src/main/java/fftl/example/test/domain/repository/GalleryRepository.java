package fftl.example.test.domain.repository;

import fftl.example.test.domain.entity.GalleryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<GalleryEntity, Long> {
}

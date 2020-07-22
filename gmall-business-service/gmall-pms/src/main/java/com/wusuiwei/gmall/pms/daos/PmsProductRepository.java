package com.wusuiwei.gmall.pms.daos;

import com.wusuiwei.gmall.pms.entities.PmsProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsProductRepository extends JpaRepository<PmsProductEntity, Long>, JpaSpecificationExecutor<PmsProductEntity> {

}

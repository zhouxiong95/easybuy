package cn.itsource.easybuy.service;

import cn.itsource.easybuy.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author solargen
 * @since 2019-07-30
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();
}

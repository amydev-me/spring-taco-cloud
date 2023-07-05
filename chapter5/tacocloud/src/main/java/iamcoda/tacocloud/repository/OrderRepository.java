package iamcoda.tacocloud.repository;

import iamcoda.tacocloud.entity.IngredientRef;
import iamcoda.tacocloud.entity.Taco;
import iamcoda.tacocloud.entity.TacoOrder;
import org.springframework.asm.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Types;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Repository
public interface OrderRepository
        extends CrudRepository<TacoOrder, Long>{
}

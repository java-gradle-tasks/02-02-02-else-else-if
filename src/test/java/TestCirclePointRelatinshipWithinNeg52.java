import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirclePointRelatinshipWithinNeg52 {

   @Test
   public void test() {
      Circle circle=new Circle(-5,2,0.5);
      Point point=new Point(-5.2,2.3);

      MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.WITHIN;
      MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

      Assertions.assertEquals(expected,actual,"A pont a korben esetet nem jol hatarozta meg!");
   }
}

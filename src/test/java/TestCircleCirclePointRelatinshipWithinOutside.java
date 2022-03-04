import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCircleCirclePointRelatinshipWithinOutside {

   @Test
   public void test() {
      Circle first=new Circle(0,0,2);
      Circle second=new Circle(2,0,0.3);
      Point point=new Point(1,0);

      ReletionshipCircleCirclePoint expected=new ReletionshipCircleCirclePoint();
      expected.firstCircle=MyCircleRelationship.Relationship.WITHIN;
      expected.secondCircle=MyCircleRelationship.Relationship.OUTSIDE;

      ReletionshipCircleCirclePoint actual= MyCircleRelationship.getCirceCircleAndPointRelation(first,second,point);

      Assertions.assertEquals(expected.firstCircle,actual.firstCircle,"Az elso pont es kor helyzetet rosszul hatarozta meg!");
      Assertions.assertEquals(expected.secondCircle,actual.secondCircle,"A masodik pont es kor helyzetet rosszul hatarozta meg!");
   }
}

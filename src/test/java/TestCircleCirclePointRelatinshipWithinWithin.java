import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCircleCirclePointRelatinshipWithinWithin {

   @Test
   public void test() {
      Circle first=new Circle(0,1,3);
      Circle second=new Circle(2,0,4.5);
      Point point=new Point(1.2,0.4);

      ReletionshipCircleCirclePoint expected=new ReletionshipCircleCirclePoint();
      expected.firstCircle=MyCircleRelationship.Relationship.WITHIN;
      expected.secondCircle=MyCircleRelationship.Relationship.WITHIN;

      ReletionshipCircleCirclePoint actual= MyCircleRelationship.getCirceCircleAndPointRelation(first,second,point);

      Assertions.assertEquals(expected.firstCircle,actual.firstCircle,"Az elso pont es kor helyzetet rosszul hatarozta meg!");
      Assertions.assertEquals(expected.secondCircle,actual.secondCircle,"A masodik pont es kor helyzetet rosszul hatarozta meg!");
   }
}

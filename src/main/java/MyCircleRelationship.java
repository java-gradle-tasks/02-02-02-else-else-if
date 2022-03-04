public class MyCircleRelationship {

	enum Relationship {
		ON,
		OUTSIDE,
		WITHIN,
	}

	public static Relationship getCirceAndPointRelation(Circle circle, Point point) {

	}

	public static ReletionshipCircleCirclePoint getCirceCircleAndPointRelation(Circle firstCircle, Circle secondCircle, Point point) {
		ReletionshipCircleCirclePoint result=new ReletionshipCircleCirclePoint();
		return result;
	}

	public static void  main(final String[] args) {
		// Write your solution here
		Circle circle=new Circle(0,0,1);
		Point point=new Point(0,1);

		Relationship relationship;
		relationship = getCirceAndPointRelation(circle,point);

		Circle first=new Circle(0,1,3);
		Circle second=new Circle(2,0,4.5);
		point=new Point(1.2,0.4);

		ReletionshipCircleCirclePoint actual= MyCircleRelationship.getCirceCircleAndPointRelation(first,second,point);
	}
}

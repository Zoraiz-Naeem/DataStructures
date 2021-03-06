

public class WeightedGraph extends Graph{
	
	public WeightedGraph() {
		super();
	}

	public void addWeightedEdge(final Node first, final Node second, int edgeWeight) {
		first.addEdge(second, edgeWeight);
	}
	
	public void removeDirectedEdge(final Node first, final Node second) {
		first.removeEdge(second);
	}
}

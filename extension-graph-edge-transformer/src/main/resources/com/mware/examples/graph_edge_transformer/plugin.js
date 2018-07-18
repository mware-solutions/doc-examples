require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.edge.transformer', function(data) {
        data.numProperties = data.edges.reduce(function(sum, edge) {
            return sum + edge.properties.length;
        }, 0)
    });

    bc.registry.registerExtension('com.mware.graph.style', function(cytoscapeStylesheet) {
         cytoscapeStylesheet.selector('edge[numProperties]')
             .style({
                 'line-color': 'mapData(numProperties, 4, 10, blue, red)',
                 'target-arrow-color': 'mapData(numProperties, 4, 10, blue, red)'
             })
    });
});

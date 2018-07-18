require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.node.transformer', function(vertex, data) {
        data.numProperties = vertex.properties.length;
    });

    bc.registry.registerExtension('com.mware.graph.style', function(cytoscapeStylesheet) {
        var pixelRatio = 'devicePixelRatio' in window ? window.devicePixelRatio : 1;
        cytoscapeStylesheet.selector('node[numProperties]')
            .style({
                'width': 'mapData(numProperties, 4, 15, ' + 30 * pixelRatio + ', ' + 75 * pixelRatio + ')',
                'height': 'mapData(numProperties, 4, 15, ' + 30 * pixelRatio + ', ' + 75 * pixelRatio + ')'
            })
    });
});

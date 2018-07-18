require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.graph.export', {
        menuItem: i18n('com.mware.examples.graph_export.label'),
        componentPath: 'com.mware/examples/graph_export/configuration'
    });

});

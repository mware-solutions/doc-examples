require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.graph.export', {
        menuItem: i18n('com.mware.examples.graph_export.label'),
        componentPath: 'com/mware/examples/graph_export/configuration'
    });

});

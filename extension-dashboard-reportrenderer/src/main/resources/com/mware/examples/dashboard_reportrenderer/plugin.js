require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.web.dashboard.reportrenderer', {
        identifier: 'com.mware-examples-dashboard-reportrenderer',
        label: i18n('com.mware.examples.dashboard_reportrenderer.label'),
        supportsResponse: function(data) {
            return true;
        },
        componentPath: 'com.mware/examples/dashboard_reportrenderer/renderer'
    });

});

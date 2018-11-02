require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.dashboard.toolbar.item', {
        identifier: 'com.mware-examples-dashboard-toolbar',
        canHandle: function(options) {
            return options.extension.identifier === 'com.mware-web-notifications'
        },
        tooltip: 'My Example Action',
        icon: '/com.mware/examples/dashboard_toolbaritem/trash.png',
        action: {
            type: 'popover',
            componentPath: 'com/mware/examples/dashboard_toolbaritem/popover'
        }
    });
});

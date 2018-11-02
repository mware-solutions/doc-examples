require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.activity', {
        type: 'com-mware-examples-activity',
        kind: 'longRunningProcess',
        titleRenderer: function(el, process) {
            el.textContent = "Example Activity";
        },
        finishedComponentPath: 'com/mware/examples/activity/Finished'
    });

    window.startActivity = function(propertyA) {
        if (!propertyA) {
            throw new Error('Include a parameter')
        }
        bc.connect().then(function(api) {
            api.dataRequest('com-mware-examples-activity', 'start', propertyA)
        });
    }

});

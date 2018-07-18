define('data/web-worker/services/com-mware-examples-activity', ['public/v1/workerApi'], function(workerApi) {
    return {
        start: function(propertyA) {
            return workerApi.ajax('POST', '/com/mware/examples/activity/start', {
                propertyA: propertyA
            });
        }
    }
})
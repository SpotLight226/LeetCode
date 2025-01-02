class EventEmitter {
    
    /**
     * @param {string} eventName
     * @param {Function} callback
     * @return {Object}
     */
    constructor() {
        this.callTable = {};
    }

    subscribe(eventName, callback) {
        if(this.callTable[eventName])
            this.callTable[eventName].push(callback);
        else
            this.callTable[eventName] = [callback];

        return {
            unsubscribe: () => {
                this.callTable[eventName] = this.callTable[eventName].filter((fn) => fn != callback);        
            }
        };
    }
    
    /**
     * @param {string} eventName
     * @param {Array} args
     * @return {Array}
     */
    emit(eventName, args = []) {
        if(!this.callTable[eventName]){
            return [];
        }

        return this.callTable[eventName].map((fn) =>fn(...args));
    }
}

/**
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */
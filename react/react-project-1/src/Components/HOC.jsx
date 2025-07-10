import React from 'react';

const HOC = (WrappedComponent, initialValue = 0) => {

    class NewComponent extends React.Component {
        constructor() {
            super();
            this.state = {
                count: initialValue
            }
        }

        handleIncrement = (e) => {
            this.setState({ count: this.state.count + 1 });
        }

        render() {
            return (
                <>
                    <WrappedComponent count={this.state.count} handleIncrement={this.handleIncrement} {...this.props} />
                </>
            )
        }
    }

    return NewComponent;
}

export default HOC;
